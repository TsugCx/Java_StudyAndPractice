# Java, Study And Practice ☕︎

Repositório pessoal para pratica e estudo da linguagem de programação Java.

## INTRODUÇÃO

### LINGUAGEM JAVA

>   Java é uma linguagem de programação e plataforma de computação. Foi criada por James Gosling na Sun Microsystems na década 
> de 1990. É uma linguagem orientada a objetos e altamente tipada, multiplataforma, ou seja, pode ser usada em vários sistemas 
> operacionais e dispositivos É usada para criar aplicativos móveis, software empresarial, jogos, aplicações da web, dispositivos 
> da Internet das Coisas (IoT), macrodados, aplicações distribuídas e com base na cloud.

### JVM

![JVM](https://www.alura.com.br/artigos/assets/java/java-compilacao-class-bytecodes.jpg)
>   A linguagem Java é uma linguagem compilada, mas com uma caracterisca diferencial em que os codigos escritos em ``.java/.class/.JAR`` sejam copilado em bytecode
> o qual será executado pela JVM (Java Virtual Machine) especifíca para cada tipo de sistem. Desse modo a linguagem Java se torna flexível por permitir que o codido
> seja escrito uma única vez e executado em qualquer ambiente sem a necessidade de ser adaptado para cada sistema.
---

### TIPOS PRIMITIVOS: 02 a 03

>   A linguagem de programação Java é estaticamente tipada, o que significa que todas as variáveis devem ser declaradas antes 
> de poderem ser usadas. Isso envolve declarar o tipo e o nome da variável.O tipo de uma variavel, define o espaço que será 
> alocado em memoria para armazenar o valor pretenddido, sendo abstrações de valores de armazenamento binarios no qual, um
> bit equivale a 1 ou 0, ao se agrupar um conjuto de 8 bits, consegue-se um byte( 00000000 | 1100101 | 00110010 | ...), no qual
> o o ultimo digito a esquerda define se o valor será positivo caso seja 0, ou negativo caso seja 1, desse modo o numero e exibido 
> na base decimal.


#### Inteiros


>   Os tipos inteiros, armazenam numeros no quais não possuam casas decimais, possuem uma ampla diversidadde de tipos permitindo
> a utilização de diversos intervalos de valores conforme a quantidadde de bits alocadas. Podendo esse valores também serem 
> expressos em binario ```int binVal = 0b11010;``` ou hexadecimal ```int hexVal = 0x1a;```.

| *TIPO* | *TAMANHO* | *INTERVALO*                                                | *Valor padrão (para campos)* |
|--------|----------|------------------------------------------------------------|------------------------------|
| char   | 8 bits   | -128 a 127                                                 | '\u0000'                     |
| byte   | 	8 bits  | 	-128 a 127                                                | 0                            |
| short  | 	16 bits | 	-32.768 a 32.767                                          | 0                            |
| int    | 	32 bits | 	-2.147.483.648 a 2.147.483.647                            | 0                            |
| long   | 64 bits  | 	-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807    | 0L                           |




### Ponto Flutuante

>Os tipos de ponto flutuante são utilizados nas representações de valores de ponto flutuante, valendo ressaltar que por 
> contas das abstrações os valores representados podem possuir pequenas variancias, não sendo assim indiacado o uso em 
> programas que exigem alta prescisão, nesse caso optando por metodos proprios do java pensados para esse tipo de utilização.

| *TIPO* | *TAMANHO* | *INTERVALO*                            | *Valor padrão (para campos)* |
|--------|-----------|----------------------------------------|------------------------------|
| float  | 32 bits   | _fora do escopo para discursão_        | 0,0f                         |
| double | 64 bits   | _fora do escopo para discursão_        | 0,0d                         |

### Booleanos

> Variaveis de tipo booleano só podem assumir dois valores possiveis, sendo eles 0 para false, ou 1 para true, tendo seu 
> uso combinado a operadores logicos afim de realizar operações condicionais. Em tese o espaço ocupado em memoria seria 
> apenas de um bit por esse comprender os valores de 0 e 1, porém o minimmo alocado para declaração da variavel sempre sera
> um byte ou 8 bits.

---
## OPERADORES

### OPERADORES ARITMETICOS

| *OPERADORES*           | *AÇÃO*                            |
|------------------------|-----------------------------------|
| +                      | soma                              |
| -                      | subtração                         |
| *                      | multiplcação                      |
| /                      | divisão                           |
| %                      | modulo da divisão                 |
| -                      | sinal de negativo                 |
| *OPERADORES COMPOSTOS* | *AÇÃO*                            |
| +=                     | soma com atribuição               |
| -=                     | subtração com atribuição          |
| *=                     | multiplcação com atribuição       |
| /=                     | divisão com atribuição            |
| %=                     | modulo da divisão com atribuição  |
| ++                     | Incremento                        |
| --                     | Decremento                        |


### OPERADORES LÓGICOS

>Esses operadores tem como objetivo realizar operações de igualdade, deseigualdade e diferença, retornando apenas valores booleanos.

| *OPERADOR* | *AÇÃO*         |
|------------|----------------|
| \>         | Maior          |
| >=         | Maior ou igual |
| <          | Menor          |
| <=         | Menor ou igual |
| ==         | Igual          |
| !=         | Não igual      |
| &&         | AND            |
| \|\|       | OR             |
| !          | NOT            |

### OPERADORES BIT A BIT

>Operadores Bit a Bit são usados para realizar operações diretamente nos bits de números inteiros. Esses operadores são 
> úteis em situações de baixo nível, como manipulação de flags, otimização de código ou trabalhar com protocolos de comunicação.

| *OPERADOR* | *AÇÃO*                                                                                                                  |
|------------|-------------------------------------------------------------------------------------------------------------------------|
| &          | AND (O resultado é 1 apenas se ambos os bits forem 1.)                                                                  |
| \|         | OR (O resultado é 1 se pelo menos um dos bits for 1.)                                                                   |      
| ^          | XOR (O resultado é 1 se os bits forem diferentes.)                                                                      |
| ~          | NOT (Inverte todos os bits (os 1s viram 0s e vice-versa).)                                                              |
| <<         | deslocamento para a esquerda(Equivale a multiplicar o número por 2^_n_, onde _n_ é o número de posições deslocadas.)    |
| \>>        | deslocamento para a direita(Desloca os bits para a direita, mantendo o sinal (preenche com o bit do sinal à esquerda).) |

---

## ESTRUTURAS CONDICIONAIS: 05 a 08

>Estruturas condicionais, utilizam operações logicas para executar ou deixar de executar com base nas condições alcançadas
> durante a execução pelos resultados das operações.

#### if else

>o 'if' e uma estruta condicional na qual se a condição que estiver entre parenteses for  verdadeira, o bloco de codigo 
> atrelado a essa verificação será executa, o 'if else' serve como uma extensão a isso, podendo adicionar inumeras verificações
> a mais ao if inicial, permitindo verificar se outras condições na execução do codigo são verdadeiras, já o 'else' não 
> possui nenhuma condição atrelado, e se usado ele executa o bloco de codigo atrelado caso nenhuma outra condição tenha 
> sido atendida.

#### switch

> switch e uma estrutura que recebe por padrão o valor de entrada, nele e possivel atribuir diversos casos para diferentes 
> valores de entrada, fazendo com que o switch execute o caso que possui por atribuição o mesmo valor de entrada, ao fim
> da execução do caso, se não houver um 'break' ao fim do bloco de codigo, o switch ira continuar sua execução até que 
> todos os cases posterios sejam executados. Existem tambem a possibilidade de se atribuir um case defalt, para caso o 
> valor de entrada não se iguale a nenhum dos outros cases, assim o defalt será executado.

---
## ESTRUTURAS DE REPETIÇÃO: 09 a 10

>Estruturas de repetição são meios no qual um determinado trecho de codigo se repita, até que a condição que cria o loop
> seja desfeita.

#### while / do while 

>Essa função pode ser aplicada primariamente de duas maneiras, na primeira de forma do while onde enquanto a condição for
> verdadeira o codigo será executado, e da forma do while, na qual o loop e executado uma vez e após e feita a verificação 
> para retornar ao começo ou encerrar o loop.

## for

> O laço for, possui tres partes principais, a inicialização(onde uma variavel pode ser inicializada antes do inicio do loop),
> a condição(a qual matém o bloco de codigo em loop, até que a condição seja falsa) e por fim a de termino(na qual, ao w
> fim de cada loop o codigo reliza algo determoinado nesse campo), a parte e inicial não são necessarias para se utilizar
> o for, porém a condição e essencial para criação do loop.