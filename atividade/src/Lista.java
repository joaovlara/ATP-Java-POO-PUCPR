public class Lista {
    private No primeiro;

    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    // Ta Vazia?:
    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }

    }

    // Inserir primeiro:
    public void inserePrimeiro(int valor) {
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro = no1;

    }

    // Mostrar Lista:
    public void mostrar() {
        if (estaVazia()) {
            System.out.println("Não nós porque esta lista esta vazia");
        } else {
            No cursor = primeiro;
            while (cursor != null) {
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();

            }
        }
    }

    // Insere ultimo:
    public void insereUltimo(int valor) {
        if (estaVazia()) {
            inserePrimeiro(valor);
        } else {
            No cursor = primeiro;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);

        }
    }

    // =insere depois:
    public void insereDepois(No no, int valor) {
        No no1 = new No(valor);
        no1.setProximo(no.getProximo());
        no.setProximo(no1);

    }

    public No removePrimeiro() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return null;
        } else {
            No cursor = primeiro;
            primeiro = primeiro.getProximo();
            return cursor;
        }
    }

    // remove depois;

    public void removeDepois(No no) {
        if (estaVazia()) {
            System.out.println("Lista vazia");
        } else {
            No cursor = primeiro;
    
            while (cursor != null && !cursor.equals(no)) {
                cursor = cursor.getProximo();
            }
    
            if (cursor != null && cursor.getProximo() != null) {
                No proximo = cursor.getProximo();
                cursor.setProximo(proximo.getProximo());
                proximo.setProximo(null);
            } else {
                System.out.println("Nó não encontrado ou é o último nó da lista.");
            }
        }
    }
    // Remove último:
    public void removeUltimo() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
        } else if (primeiro.getProximo() == null) {
            primeiro = null;
        } else {
            No cursor = primeiro;
            while (cursor.getProximo().getProximo() != null) {
                cursor = cursor.getProximo();
            }
            cursor.setProximo(null);
        }
    }

 // Remove nó:
 public void remove(No no) {
    if (estaVazia()) {
        System.out.println("Lista vazia");
    } else if (no == primeiro) {
        removePrimeiro();
    } else {
        No cursor = primeiro;
        while (cursor != null && cursor.getProximo() != no) {
            cursor = cursor.getProximo();
        }
        if (cursor != null) {
            cursor.setProximo(no.getProximo());
            no.setProximo(null);
        } else {
            System.out.println("Nó não encontrado na lista.");
        }
    }
}

public void insereAntes(int i) {
}

public void insereDepois(int i, int valor) {
}


}
