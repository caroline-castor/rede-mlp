package modelo;
public class Representacao {
	private final int LINHAS = 5;

	private final int COLUNAS = 5;

	private int[][] matriz = new int[LINHAS][COLUNAS];
	
	public Representacao(int[][] valoresIniciais) {
		this.matriz = valoresIniciais;
	}

	public void setLinha(int linha, int[] valores) {
		if ((linha >= 0) && (linha < LINHAS)) {
			int j = COLUNAS;
			if (valores.length < j) {
				j = valores.length;
			}
			for (int i = 0; i < j; i++) {
				this.matriz[linha][i] = valores[i];
			}
		}

	}

	public void setColuna(int coluna, int[] valores) {
		if ((coluna >= 0) && (coluna < COLUNAS)) {
			int j = LINHAS;
			if (valores.length < j) {
				j = valores.length;
			}
			for (int i = 0; i < j; i++) {
				this.matriz[i][coluna] = valores[i];
			}
		}

	}

	public void setMatriz(int[][] valores) {
		for (int i = 0; i < LINHAS; i++)
			for (int j = 0; j < COLUNAS; j++) {
				this.matriz[i][j] = valores[i][j];
			}
	}

	public int[][] getMatriz() {
		return this.matriz;
	}

	public int getValor(int linha, int coluna) {
		if ((linha >= 0) && (linha < LINHAS) && (coluna >= 0)
				&& (linha < COLUNAS)) {
			return this.matriz[linha][coluna];
		} else
			return 0;
	}
	
	public int[] getValoresEmSerie () {
		int [] valoresEmSerie = new int[LINHAS*COLUNAS];
		int k = 0;
		for (int i = 0; i < LINHAS; i++)
			for (int j = 0; j < COLUNAS; j++) {
				valoresEmSerie [k++] = this.matriz[i][j];
			}
		return valoresEmSerie;
	}
	
	public String toString() {
		String representacaoTextual = "";
		for (int i = 0; i < LINHAS; i++) {
			for (int j = 0; j < COLUNAS; j++) {
				if (this.matriz[i][j] == -1)
					representacaoTextual += "0";
				else
					representacaoTextual += "1";
			}
			representacaoTextual += "\n"; 
		}
		return representacaoTextual;
	}

}
