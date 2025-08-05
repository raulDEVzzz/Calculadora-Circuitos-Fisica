# Calculadora de Circuitos Elétricos

Este projeto é uma calculadora gráfica desenvolvida em Java para auxiliar na resolução de circuitos elétricos simples com duas malhas, como os encontrados em exercícios acadêmicos. Foi criado como parte de um trabalho para a disciplina de Física, no segundo ano da graduação na UNESPAR.

---

## 📘 Referência bibliográfica

Baseado nos conceitos e exemplos do livro:

**Fundamentos de Física – Volume 3: Eletromagnetismo (9ª Edição)**  
Autores: David Halliday, Robert Resnick, Jearl Walker  
📖 Exercício 23 do Capítulo 27 (Fig. 27-38)

---

## 🧠 Funcionalidades

- Interface gráfica para inserção de dados (resistores e fontes de tensão)
- Cálculo automático das correntes nos resistores \( R_1 \) e \( R_2 \)
- Cálculo da diferença de potencial entre os pontos \( a \) e \( b \)
- Exibição dos resultados de forma clara e organizada

---

## 📂 Arquivos principais

- `Aplicacao.java` — ponto de entrada do programa  
- `InterfaceCalculadoraCircuito.java` — interface gráfica (GUI)  
- `CalculadoraDeCircuito.java` — lógica de cálculo baseada em análise de malhas  
- `ResultadoCalculo.java` — estrutura de armazenamento dos resultados  

---

## ▶️ Como executar

1. Certifique-se de ter o Java instalado (Java 8 ou superior).
2. Compile os arquivos:

   ```bash
   javac *.java
   ```

3. Execute o programa:

   ```bash
   java Aplicacao
   ```

Ou, se estiver utilizando uma IDE como IntelliJ, Eclipse ou NetBeans, basta importar o projeto e executar a classe `Aplicacao`.

---

## 🖼️ Exemplo da interface gráfica

![Interface](https://github.com/user-attachments/assets/da65eaa3-7f4a-41ed-935c-ef143e492c54)

---

## 📄 Enunciado do exercício (Ex. 23 - Cap. 27)

![Enunciado](https://github.com/user-attachments/assets/3748ac89-0bcc-4ffa-a092-817d47035956)

---

## 🔢 Exemplo de entrada e saída

**Entradas:**
- \( R_1 = 100\,\Omega \)
- \( R_2 = 50\,\Omega \)
- \( arepsilon_1 = 6.0\,V \)
- \( arepsilon_2 = 5.0\,V \)
- \( arepsilon_3 = 4.0\,V \)

**Saída esperada:**
- Corrente em \( R_1 \): -0.010 A  
- Corrente em \( R_2 \): 0.040 A  
- Diferença de potencial \( V_{ab} \): -2.000 V

---

## 🛠️ Tecnologias utilizadas

- Java (versão 8+)
- Swing (biblioteca gráfica padrão do Java)

---

## 👨‍🎓 Autor

**Raul Soares de Almeida**  
Graduando em Ciência da Computação – 2º ano  
Universidade Estadual do Paraná (UNESPAR)

---

## 📄 Licença

Este projeto tem fins exclusivamente educacionais.
