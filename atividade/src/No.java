
public class No {

    private int info;
    private No proximo;

    //Construtor

    public No(int info) {
        this.info = info;
        this.proximo = null;
    }

    

    /**
     * @return int return the info
     */
    public int getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(int info) {
        this.info = info;
    }

    /**
     * @return No return the proximo
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}

