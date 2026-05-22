# Livro de Receitas Digital (Java)

Um aplicativo de console simples desenvolvido em Java que permite ao usuário criar e salvar suas receitas favoritas diretamente em arquivos de texto (`.txt`). O programa captura o nome da receita, os ingredientes e o modo de preparo passo a passo de forma dinâmica.

---

## 🚀 Funcionalidades

* **Nome personalizado:** Define o nome da receita, que também será utilizado automaticamente como o nome do arquivo gerado.
* **Inserção dinâmica de ingredientes:** Recebe a descrição e a quantidade de cada ingrediente um a um. O usuário decide quando parar apenas apertando `Enter` em uma linha em branco.
* **Modo de preparo enumerado:** Captura as instruções passo a passo, gerando a numeração automática dos passos (`Passo 1`, `Passo 2`, etc.).
* **Salvamento automático:** Cria um arquivo de texto formatado com o nome da receita (substituindo espaços por `_` para manter a compatibilidade do sistema).

---

## 📋 Formato do Arquivo Gerado

O arquivo final `.txt` é estruturado da seguinte forma:

Nome da Receita

1. Ingrediente A - Quantidade
2. Ingrediente B - Quantidade

Passo 1: Instrução inicial...
Passo 2: Instrução seguinte...


---

## 🛠️ Tecnologias Utilizadas

* **Java SE (Standard Edition)**
* **Scanner:** Para captura de dados via console.
* **PrintWriter / FileWriter:** Para manipulação e escrita de arquivos locais.
* **Try-with-resources:** Para gerenciamento seguro de abertura e fechamento de arquivos.

---

## 💻 Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Baixe ou clone este repositório.
3. Abra o terminal na pasta do arquivo e compile o código:
   ```bash
   javac LivroDeReceitas.java