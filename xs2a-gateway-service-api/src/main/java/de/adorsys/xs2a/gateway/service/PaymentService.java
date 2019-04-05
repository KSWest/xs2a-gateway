package de.adorsys.xs2a.gateway.service;

public interface PaymentService {
    PaymentInitiationRequestResponse initiateSinglePayment(String paymentProduct, Object body, PaymentInitiationHeaders headers);

    PaymentInformationResponse getPaymentInformation(String paymentService, String paymentProduct, String paymentId, PaymentInformationHeaders headers);

    PaymentInitiationScaStatusResponse getPaymentInitiationScaStatus(String paymentService, String paymentProduct, String paymentId, String authorisationId, PaymentInitiationScaStatusHeaders headers);
}
