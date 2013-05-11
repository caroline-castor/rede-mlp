package modelo;
public interface TreinamentoPadrao {

	public static final int[][] ZERO = { { 1, 1, 1, 1, 1 },
			{ 1, -1, -1, -1, 1 }, { 1, -1, -1, -1, 1 }, { 1, -1, -1, -1, 1 },
			{ 1, 1, 1, 1, 1 } };

	public static final int[][] UM = { { -1, -1, 1, -1, -1 },
			{ -1, -1, 1, -1, -1 }, { -1, -1, 1, -1, -1 },
			{ -1, -1, 1, -1, -1 }, { -1, -1, 1, -1, -1 } };

	public static final int[][] DOIS = { { 1, 1, 1, 1, 1 },
			{ -1, -1, -1, -1, 1 }, { 1, 1, 1, 1, 1 }, { 1, -1, -1, -1, -1 },
			{ 1, 1, 1, 1, 1 } };

	public static final int[][] TRES = { { 1, 1, 1, 1, 1 },
										 { -1, -1, -1, -1, 1 },
										 { 1, 1, 1, 1, 1 },
										 { -1, -1, -1, -1, 1 },
										 { 1, 1, 1, 1, 1 } };

	public static final int[][] QUATRO = { { -1, -1, 1, 1, -1 },
										   { -1, 1, -1, 1, -1 },
										   { 1, 1, 1, 1, 1 },
										   { -1, -1, -1, 1, -1 },
										   { -1, -1, -1, 1, -1 } };

	public static final int[][] CINCO = { { 1, 1, 1, 1, 1 },
			{ 1, -1, -1, -1, -1 }, { 1, 1, 1, 1, 1 }, { -1, -1, -1, -1, 1 },
			{ 1, 1, 1, 1, 1 } };

	public static final int[][] SEIS = { { 1, 1, 1, 1, 1 },
			{ 1, -1, -1, -1, -1 }, { 1, 1, 1, 1, 1 }, { 1, -1, -1, -1, 1 },
			{ 1, 1, 1, 1, 1 } };

	public static final int[][] SETE = { { 1, 1, 1, 1, 1 },
			{ -1, -1, -1, 1, -1 }, { -1, -1, 1, -1, -1 },
			{ -1, 1, -1, -1, -1 }, { 1, -1, -1, -1, -1 } };

	public static final int[][] OITO = { { 1, 1, 1, 1, 1 },
			{ 1, -1, -1, -1, 1 }, { 1, 1, 1, 1, 1 }, { 1, -1, -1, -1, 1 },
			{ 1, 1, 1, 1, 1 } };

	public static final int[][] NOVE = { { 1, 1, 1, 1, 1 },
										 { 1, -1, -1, -1, 1 },
										 { 1, 1, 1, 1, 1 },
										 { -1, -1, -1, -1, 1 },
										 { 1, 1, 1, 1, 1 } };

	public static final Representacao REPRESENTACAO_ZERO = new Representacao(
			ZERO);

	public static final Representacao REPRESENTACAO_UM = new Representacao(UM);

	public static final Representacao REPRESENTACAO_DOIS = new Representacao(
			DOIS);

	public static final Representacao REPRESENTACAO_TRES = new Representacao(
			TRES);

	public static final Representacao REPRESENTACAO_QUATRO = new Representacao(
			QUATRO);

	public static final Representacao REPRESENTACAO_CINCO = new Representacao(
			CINCO);

	public static final Representacao REPRESENTACAO_SEIS = new Representacao(
			SEIS);

	public static final Representacao REPRESENTACAO_SETE = new Representacao(
			SETE);

	public static final Representacao REPRESENTACAO_OITO = new Representacao(
			OITO);

	public static final Representacao REPRESENTACAO_NOVE = new Representacao(
			NOVE);
	
	public static final Representacao[] REPRESENTACOES = {REPRESENTACAO_ZERO,
		REPRESENTACAO_UM, REPRESENTACAO_DOIS, REPRESENTACAO_TRES, REPRESENTACAO_QUATRO,
		REPRESENTACAO_CINCO, REPRESENTACAO_SEIS, REPRESENTACAO_SETE, 
		REPRESENTACAO_OITO, REPRESENTACAO_NOVE};
	
	public static final String[] ELEMENTOS = {"0", "1", "2", "3", "4",
		"5", "6", "7", "8", "9"};
	
	public static final int[] SAIDA_ZERO = {1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	public static final int[] SAIDA_UM = {-1, 1, -1, -1, -1, -1, -1, -1, -1, -1};
	public static final int[] SAIDA_DOIS = {-1, -1, 1, -1, -1, -1, -1, -1, -1, -1};
	public static final int[] SAIDA_TRES = {-1, -1, -1, 1, -1, -1, -1, -1, -1, -1};
	public static final int[] SAIDA_QUATRO = {-1, -1, -1, -1, 1, -1, -1, -1, -1, -1};
	public static final int[] SAIDA_CINCO = {-1, -1, -1, -1, -1, 1, -1, -1, -1, -1};
	public static final int[] SAIDA_SEIS = {-1, -1, -1, -1, -1, -1, 1, -1, -1, -1};
	public static final int[] SAIDA_SETE = {-1, -1, -1, -1, -1, -1, -1, 1, -1, -1};
	public static final int[] SAIDA_OITO = {-1, -1, -1, -1, -1, -1, -1, -1, 1, -1};
	public static final int[] SAIDA_NOVE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
	
	public static final int[][] SAIDAS = {SAIDA_ZERO, SAIDA_UM, SAIDA_DOIS, SAIDA_TRES,
		SAIDA_QUATRO, SAIDA_CINCO, SAIDA_SEIS, SAIDA_SETE, SAIDA_OITO, SAIDA_NOVE};
}
