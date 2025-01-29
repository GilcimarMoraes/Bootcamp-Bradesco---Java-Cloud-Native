# DIO - Trilha Java Básico
[www.dio.me](https://www.dio.me)

## Autores
- Gleyson Sampaio

## Sintaxe - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

### Descrição do Desafio
Crie o projeto **ContaBanco** que receberá dados via terminal contendo as características de uma conta em banco conforme os atributos abaixo:

Dentro do projeto, crie a classe **ContaTerminal.java** para realizar toda a codificação do programa.

### Atributos da Conta
| Atributo      | Tipo     | Exemplo       |
|---------------|----------|---------------|
| Numero        | Inteiro  | 1021          |
| Agencia       | Texto    | 067-8         |
| Nome Cliente  | Texto    | MARIO ANDRADE |
| Saldo         | Decimal  | 237.48        |

### Requisitos
1. **Revise sobre regras de declaração de variáveis**:
   - Declare as variáveis conforme os tipos indicados na tabela acima.

2. **Revise sobre terminal, main args e a classe Scanner**:
   - Utilize a classe `Scanner` para receber os dados do usuário via terminal.

3. **Permita que os dados sejam inseridos via terminal**:
   - O programa deve solicitar as informações ao usuário, exibindo mensagens como:
     ```
     Programa: "Por favor, digite o número da Agência!"
     Usuário: 1021 (depois ENTER para o próximo campo)
     ```

4. **Revise sobre concatenação e classe String com método concat**:
   - Utilize concatenação de strings para montar a mensagem final.

5. **Exiba a mensagem final**:
   - Após coletar todas as informações, o sistema deve exibir a seguinte mensagem:
     ```
     "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."
     ```
   - Os campos em `[ ]` devem ser substituídos pelas informações inseridas pelo usuário.

### Exemplo de Funcionamento
1. O programa solicita os dados:
