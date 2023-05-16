<h1>Sistema de Bookstore em Java</h1>

<p>Este é um exemplo de um sistema de bookstore básico implementado em Java. O sistema utiliza um conjunto de classes para representar os principais elementos e funcionalidades de uma bookstore, como books, clients, shoppingCart de compras, transações, payments, avaliações, estoque e relatórios.</p>

<h2>Funcionalidades</h2>

<ul>
  <li>Adicionar books ao carrinho de compras.</li>
  <li>Concluir transações de compra.</li>
  <li>Concluir payments.</li>
  <li>Fazer avaliações dos livros.</li>
  <li>Gerar relatórios de inventário e vendas.</li>
  <li>Gerenciar o estoque de books.</li>
</ul>

<h2>Classes</h2>

<ul>
  <li><strong>Book</strong>: representa um book, com atributos como título, autor e preço.</li>
  <li><strong>Client</strong>: representa um client da bookstore, com atributos como name.</li>
  <li><strong>ShoppingCart</strong>: gerencia o shoppingCart de compras de um client.</li>
  <li><strong>Bookstore</strong>: mantém o inventário de books e realiza transações de compra.</li>
  <li><strong>Transaction</strong>: representa uma transação de compra, contendo informações do client, shoppingCart e total da compra.</li>
  <li><strong>Payment</strong>: representa um payment realizado em uma transação.</li>
  <li><strong>Assessment</strong>: permite que os clients façam avaliações dos books.</li>
  <li><strong>Stock</strong>: gerencia a quantidade disponível de books na bookstore.</li>
  <li><strong>Report</strong>: gera relatórios de inventário e vendas.</li>
</ul>

<h2>Como Executar</h2>

<ol>
  <li>Certifique-se de ter o JDK (Java Development Kit) instalado na sua máquina.</li>
  <li>Clone este repositório para o seu ambiente local.</li>
  <li>Compile os arquivos Java utilizando o comando <code>javac</code>:</li>
</ol>

<pre><code>javac Main.java</code></pre>

<ol start="4">
  <li>Execute o programa com o comando <code>java</code>:</li>
</ol>

<pre><code>java Main</code></pre>
