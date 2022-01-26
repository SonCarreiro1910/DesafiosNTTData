### Desafio 3 – Parte Teórica.

 

**A)**   **Com suas palavras defina:**

​    **I.**      **O que é o protocolo de comunicação HTTP e como ele funciona;**

**R:** HTTP é um protocolo de transferência que permite às pessoas que inserem o URL do seu próprio site para visualizar o conteúdo e os dados. Este sistema é a base da comunicação que existe em toda a Internet, sendo que ao clicar com o mouse ou tocar na tela, os usuários poderão encontrar mais facilmente sites e conteúdos com hiperlinks.

Como o HTTP é um protocolo baseado em texto sem conexão, as pessoas que visitam o site da sua empresa enviam solicitações ao servidor e o mesmo exibe essas solicitações na forma de texto, imagens ou qualquer outro tipo de mídia. Assim que a solicitação for recebida pelo servidor, a conexão entre o usuário e o servidor será desconectada.

 

  **II.**      **O que é REST, e o qual a relação com o protocolo HTTP;**

**R:** Como um conceito abstrato de arquitetura Web, é um conjunto de princípios e definições necessários para criar um projeto com uma interface claramente definida. Portanto, o uso da arquitetura REST permite a comunicação entre os aplicativos, sendo que quando o navegador for aberto, ele estabelecerá uma conexão TCP/ IP com o servidor do destino, enviando uma solicitação GET HTTP e obtendo o endereço.

A relação é que a maioria das APIs RESTful utilizam HTTP como um protocolo de comunicação oficial, uma vez que apresenta uma interface de operações padronizadas. E com isso, o próprio HTTP pode criar, atualizar, pesquisar, executar e remover muitas operações, atuando sob alguns recursos específicos.

 

 **III.**      **O que é Web API, e qual a relação com o REST;**

**R:** Web API é uma interface de programação de aplicativo (API) para servidores e navegadores. Ele é usado para recuperar apenas a quantidade necessária no banco de dados do site, fornecendo toda a infraestrutura para o desenvolvimento do serviço, selecionando o método a ser executado, convertendo as mensagens em parâmetros e tipos apropriados, aplicando filtros, etc. Por padrão, cada solicitação tem como um objetivo um método nesta classe, que processa e retorna o resultado.

A relação é que a Web API estabelece uma conformidade com as restrições do estilo de arquitetura REST, permitindo a interação com a com o serviço RESTful.

 

**B)**   **Liste todos os métodos de solicitação HTTP utilizados por padrão REST e suas respectivas finalidades;**

 

 **GET:** O método GET solicita a representação de um recurso específico. Requisições     utilizando o método GET devem retornar apenas dados.

 **HEAD:** O método HEAD solicita uma resposta de forma idêntica ao método GET, porém sem conter o corpo da resposta.

 **POST:** O método POST é utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do recurso ou efeitos colaterais no servidor.

 **PUT:** O método PUT substitui todas as atuais representações do recurso de destino pela carga de dados da requisição.

 **DELETE:** O método DELETE remove um recurso específico.

 **CONNECT:** O método CONNECT estabelece um túnel para o servidor identificado pelo recurso especifico.

 **TRACE:** O método TRACE executa um teste de chamada loop-back junto com o caminho par/a o recurso de destino.

 **PATCH:** O método PATCH é utilizado para aplicar modificações parciais em um recurso.

 

**I)**          **O que é Swagger?**

**R:** O documento do Swagger especifica a lista de recursos que estão disponíveis na API REST e as operações que podem ser chamadas nesses recursos, também especifica a lista de parâmetros para uma operação, incluindo o nome e o tipo dos parâmetros, se os parâmetros são necessários ou opcionais e informações sobre valores aceitáveis para esses parâmetros. Além disso, pode incluir um Esquema JSON que descreve a estrutura do corpo da solicitação que é enviada para uma operação em uma API REST e o esquema JSON descreve a estrutura de quaisquer corpos de resposta retornados de uma operação.