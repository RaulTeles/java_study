package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;
        for (int i=1; i<=months; i++){
//            Somando os meses em base ao valor de i utilizando o metodo plusMoths do LocalDate
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota,i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double totalQuota = basicQuota + interest + fee;

            contract.getInstallment().add(new Installment(dueDate,totalQuota));
        }
    }
}
