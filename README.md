# xml-jaxb-xmlschemas

XML Schemas

Definição:

Trata-se de arquivos capazes de descrever o formato quem um determinado
XML deve ter (lembre-se, XML é flexível a ponto de permitir qualquer informação).
Um XML Schema, como um todo, é análogo à definição de classes em Java:
define-se os pacotes (que, em um XML Schema, são definidos como namespaces) e
as classes, propriamente ditas (que, em XML Schemas, são os tipos).
Utiliza-se XML Schemas para que tanto o cliente quanto o servidor tenham um
“acordo” a respeito do que enviar/receber (em termos da estrutura da informação).

Como criar um xml schema:

Um XML Schema simples pode ser definido da seguinte forma:

```javascript
<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema"
		targetNamespace="http://brejaonline.com.br/comum/v1"
		xmlns:tns="http://brejaonline.com.br/comum/v1">
</schema>

```


Um XML Schema é sempre definido dentro da tag schema. 

Esta tag deve conter, obrigatoriamente:

1 - a referência para o XML Schema http://www.w3.org/2001/XMLSchema
2 - o atributo targetNamespace, que aponta qual deve ser o namespace
utilizado pelo XML que estiver sendo validado por este XML Schema.
3 - Por convenção, o próprio namespace é referenciado no documento através da declaração
xmlns:tns, indicando que o prefixo tns poderá ser utilizado no escopo
deste XML Schema (esse item não é obrigatório)


Próximo passo - Definindo os elementos do XML

Os elementos são utilizados para definir informações a respeito das tags: nome
da tag, número de repetições permitido, quais sub-tags são permitidas, quais atributos
uma tag deve ter, etc.

Por exemplo, para definir uma tag nome num XML Schema, basta utilizar
o seguinte:

<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema"
targetNamespace="http://brejaonline.com.br/comum/v1"
xmlns:tns="http://brejaonline.com.br/comum/v1">
	<element name="nome" type="string" />
</schema>

Tipo Complexos são definidos a partir da junção de elementos de tipos simples e/ou outros 
tipos complexos

<complexType name="Endereco">
	<sequence>
		<element name="cep" type="tns:CEP" />
		<element name="logradouro" type="string" />
	</sequence>
</complexType>

Note que a definição do tipo complexo envolve a tag sequence. Esta tag é utilizada
para determinar que os elementos nela envolvidos devem ser inseridos nesta
ordem.

Note a referência ao tipo “CEP”, definido anteriormente. O prefixo tns, conforme
mencionado, faz referência ao namespace do próprio arquivo, ou seja, no exemplo acima
deve haver uma declaração <simpleType name="CEP" />
