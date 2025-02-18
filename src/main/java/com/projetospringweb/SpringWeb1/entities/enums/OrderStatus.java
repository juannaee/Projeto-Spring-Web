package com.projetospringweb.SpringWeb1.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1, "Aguardando Pagamento"), PAID(2, "Pago"), SHIPPED(3, "Enviado"), DELIVERED(4, "Entregue"),
	CANCELED(5, "Cancelado");

	private Integer codeStatus;
	private String description;

	private OrderStatus(Integer codeStatus, String description) {
		this.codeStatus = codeStatus;
		this.description = description;

	}

	public int getCode() {
		return codeStatus;
	}

	public String getDescription() {
		return description;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}

		}
		throw new IllegalArgumentException("Código de status da venda inválido.");
	}

}
