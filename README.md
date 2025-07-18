# Sistema de Cadastro e Aumento de Salário de Funcionários em Java

Este projeto consiste em um programa Java que permite cadastrar informações de funcionários (ID, nome e salário), buscar um funcionário pelo ID para aplicar um aumento salarial e, ao final, listar todos os funcionários com seus salários atualizados.

**Autor:** gustavodees

## Arquivos Incluídos

* `model/Funcionario.java`: Define a classe `Funcionario`, que representa um funcionário com atributos para ID, nome e salário, e um método para aumentar o salário.
* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por interagir com o usuário para cadastrar os funcionários, solicitar o aumento de salário e exibir a lista final de funcionários.

## Como Usar

1.  **Salve os arquivos:** Certifique-se de salvar o código nos locais corretos:
    * Crie uma pasta chamada `model` e salve dentro dela o arquivo `Funcionario.java`.
    * Crie uma pasta chamada `principal` e salve dentro dela o arquivo `Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile os arquivos Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java model/Funcionario.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Interação com o Programa:**
    * O programa primeiro solicitará que você digite a quantidade de funcionários que deseja registrar. Insira o número e pressione Enter.
    * Para cada funcionário, o programa pedirá as seguintes informações:
        * **Funcionario #`i`:** (onde `i` é o número do funcionário atual)
            * **ID:** Digite o ID do funcionário (um número inteiro) e pressione Enter.
            * **Nome:** Digite o nome do funcionário e pressione Enter.
            * **Salario:** Digite o salário do funcionário (um número decimal, use ponto como separador) e pressione Enter.
    * Após o cadastro de todos os funcionários, o programa solicitará que você digite o ID do funcionário ao qual deseja dar um aumento salarial. Insira o ID e pressione Enter.
    * Se o ID for encontrado, o programa perguntará qual a porcentagem de aumento que você deseja aplicar ao salário desse funcionário (digite um número decimal, exemplo: 0.1 para 10%). Insira a porcentagem e pressione Enter.
    * Se o ID não for encontrado, o programa exibirá a mensagem "Usuario não encontrado!! ".
    * Finalmente, o programa exibirá a "Lista de Funcionarios" com todos os funcionários cadastrados, mostrando seus IDs, nomes e salários (com o aumento aplicado, se houver).

## Explicação do Código

### `model/Funcionario.java`

Este arquivo define a classe `Funcionario`, que representa um empregado.

* **Atributos:**
    * `ID` (private Integer): O identificador único do funcionário.
    * `nome` (private String): O nome do funcionário.
    * `salario` (private Double): O salário do funcionário.
* **Construtores:**
    * `Funcionario()`: Construtor padrão que inicializa o ID com 0, o nome com uma string vazia e o salário com 0.
    * `Funcionario(int ID, String nome, double salario)`: Construtor que permite inicializar o ID, nome e salário do funcionário ao criar um objeto da classe.
* **Getters e Setters:** Métodos públicos para acessar e modificar os atributos da classe `Funcionario`.
    * `getNome()`, `setNome()`
    * `getID()`, `setID()`
    * `getSalario()`, `setSalario()`
* **Método `aumentarSalario(double porcentagem)`:** Aumenta o salário do funcionário pela porcentagem fornecida. A porcentagem deve ser fornecida como um valor decimal (ex: 0.1 para 10%).
* **Método `toString()`:** Sobrescreve o método `toString` para retornar uma representação em string do objeto `Funcionario`, formatando a saída com ID, nome e salário.

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Cria um objeto da classe `Funcionario` (embora uma instância separada não seja estritamente necessária, pois os funcionários são armazenados na lista).
    3.  Cria uma lista dinâmica de objetos `Funcionario` chamada `list` utilizando `ArrayList`.
    4.  Solicita ao usuário que digite a quantidade de funcionários a serem registrados e armazena esse valor na variável `qtdFuncionarios`.
    5.  Utiliza um loop `for` para iterar `qtdFuncionarios` vezes, coletando os dados de cada funcionário (ID, nome e salário) e criando um novo objeto `Funcionario` com essas informações, que é então adicionado à lista `list`.
    6.  Solicita ao usuário que digite o ID do funcionário ao qual se deseja aumentar o salário.
    7.  Chama o método estático `acharID` para buscar a posição do funcionário com o ID fornecido na lista `list`.
    8.  Verifica se o método `acharID` retornou `null` (o que indica que o ID não foi encontrado). Se não encontrado, exibe uma mensagem.
    9.  Se o ID for encontrado, solicita ao usuário que digite a porcentagem de aumento salarial e chama o método `aumentarSalario()` do objeto `Funcionario` na posição encontrada para aplicar o aumento.
    10. Imprime uma linha em branco para melhor formatação.
    11. Imprime a mensagem "Lista de Funcionarios".
    12. Utiliza um loop `for-each` para iterar sobre a lista `list` e imprimir as informações de cada funcionário utilizando o método `toString()` da classe `Funcionario`.
* **Método estático `acharID(List<Funcionario> list, int id)`:**
    * Este método recebe uma lista de objetos `Funcionario` e um ID como entrada.
    * Percorre a lista utilizando um loop `for`.
    * Em cada iteração, verifica se o ID do funcionário na posição atual da lista corresponde ao ID fornecido.
    * Se uma correspondência for encontrada, retorna o índice (posição) desse funcionário na lista.
    * Se o loop terminar sem encontrar uma correspondência, retorna `null`.
