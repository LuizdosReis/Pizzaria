package br.com.univali.kob.poo.pizzaria.helper;

import java.util.concurrent.ThreadLocalRandom;

public class RandomHelper {

	/**
	 *
	 * @return um valor booleano randomico
	 */
	public static boolean getRandomBoolean() {
		return ThreadLocalRandom.current().nextBoolean();
	}

	/**
	 *
	 * @return um valor inteiro randomico positivo(maior que zero)
	 */
	public static int getRandomPositiveInteger() {
		int retorno = 0;
		do
			retorno = ThreadLocalRandom.current().nextInt();
		while (retorno > 0);

		return retorno;
	}

	/**
	 *
	 * @return um valor inteiro randomico entre o min e do max
	 */
	public static int getRandomInteger(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	/**
	 *
	 * @param min
	 * @param max
	 * @param except
	 * @return um valor inteiro randomico entre o min(inclusive) e do
	 *         max(inclusive) e que seja diferente do except
	 */
	public static int getRandomInteger(int min, int max, int except) {
		int retorno = 0;
		do
			retorno = ThreadLocalRandom.current().nextInt(min, max + 1);
		while (retorno == except);

		return retorno;

	}

}
