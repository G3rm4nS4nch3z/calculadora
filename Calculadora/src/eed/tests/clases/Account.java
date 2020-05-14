/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eed.ejercicios.ut5;

/**
 *
 * @author Nayra Deniz
 */
public class Account {

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	// Atributos de la clase Account
	private String titular;
	private String ccc;
	private double balance = 0;

	// Constructor
	public Account(String nom, String cuenta) {
		this.titular = nom;
		this.ccc = cuenta;
	}

	// Método que me devuelve el saldo disponible en cada momento
	public double disponible() {
		return balance;
	}

	/**
	 * Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		balance = balance + cantidad;
	}

	/**
	 * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede retirar una cantidad negativa.");
		if (disponible() < cantidad)
			throw new Exception("No hay suficiente saldo para retirar la cantidad solicitada.");
		balance = balance - cantidad;
	}

	/**
	 * Inserta un t�tulo en la clase descripci�n. Al ser el t�tulo obligatorio, si
	 * es nulo o vac�o se lanzar� una excepci�n.
	 *
	 * @param titulo El nuevo t�tulo de la descripci�n.
	 * @throws IllegalArgumentException Si titulo es null, est� vac�o o contiene
	 *                                  s�lo espacios.
	 * 
	 */
	public void setTitulo(String titulo) throws IllegalArgumentException {
		if (titulo == null || titulo.trim().equals("")) {
			throw new IllegalArgumentException("El t�tulo no puede ser nulo o vac�o");
		} else {
			this.titulo = titulo;
		}
	}

}
