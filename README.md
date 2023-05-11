# Pastas de Trabalho para arquivos java: 

## <a id="instalacao">🔨 Instalação do Ambiente</a>

Obs: Estes exemplos foram formulados totalmente em um ambiente computacional dentro da nuvem. Particulamente no codespace do Github e Gitpod. Na atualidade são as melhores plataformas para isto, balanceando os custos e beneficios. Se você não conhece ou não sabe como acessa-los, [clique aqui.](https://docs.github.com/en/codespaces/developing-in-codespaces/opening-an-existing-codespace/)

No codespace abra um terminal ou teclas use <kbd>Ctrl</kbd> + <kbd>'</kbd>
Para criar os códigos fonte, via terminal, é só digitar

```bash
$ touch meuPrimeiro.java
```
Vai abrir o editor do Visual Studio, depois é só digitar conforme a necessidade do programa. Também pode ser aberto na janela gráfica, através  dos menus da barra superior.
Após aberto e salvo, pode ser feita a compilação pelo editor javac:

```bash
$ javac meuPrimeiro.java 
```
Se não apresentar nenhum erro, pode ser executado pelo comando:
```
$ Java meuPrimeiro
```
Abaixo um exemplo de um arquivo basico:
```java
import java.lang.*;

public class First
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!!");// exibir um texto com quebra de linha
        System.out.println(args[0]);// exibir texto apos linnha de comando
        System.out.println(args[1]);// exibir texto 2 apos linha de comando
    }
}
```
Aqui somente para traçar as diretrizes iniciais básicas.

- Você pode clonar este repositório:
```bash
# Clone este repositório$ g <https://github.com/joseivangeraldo/ServerPHP_Mysql>
```

