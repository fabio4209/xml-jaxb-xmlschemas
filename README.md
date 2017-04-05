# xml-jaxb-xmlschemas

XML Schemas

Como criar um xml schema:

Um XML Schema simples pode ser definido da seguinte forma:

```javascript
<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema"
		targetNamespace="http://brejaonline.com.br/comum/v1"
		xmlns:tns="http://brejaonline.com.br/comum/v1">
</schema>

```

Esta tag deve conter, obrigatoriamente:

1 - a referência para o XML Schema http://www.w3.org/2001/XMLSchema </br>
2 - o atributo targetNamespace, que aponta qual deve ser o namespace
utilizado pelo XML que estiver sendo validado por este XML Schema.</br>
3 - Por convenção, o próprio namespace é referenciado no documento através da declaração
xmlns:tns, indicando que o prefixo tns poderá ser utilizado no escopo
deste XML Schema (esse item não é obrigatório)


Próximo passo - Definindo os elementos do XML

Os elementos são utilizados para definir informações a respeito das tags: nome
da tag, número de repetições permitido, quais sub-tags são permitidas, quais atributos
uma tag deve ter, etc.

Por exemplo, para definir uma tag nome num XML Schema, basta utilizar
o seguinte:

```javascript
<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema"
targetNamespace="http://brejaonline.com.br/comum/v1"
xmlns:tns="http://brejaonline.com.br/comum/v1">
	<element name="nome" type="string" />
</schema>
```

Tipo Complexos são definidos a partir da junção de elementos de tipos simples e/ou outros 
tipos complexos:

```javascript
<complexType name="Endereco">
	<sequence>
		<element name="cep" type="tns:CEP" />
		<element name="logradouro" type="string" />
	</sequence>
</complexType>

```
Na definição <complexType> pode ser incluída a tag sequence. Esta tag é utilizada
para determinar que os elementos nela envolvidos devem ser inseridos de acordo 
com a ordem definida.

Em type="tns:CEP", note a referência ao tipo “CEP”, definido anteriormente. 
O prefixo tns, conforme mencionado, faz referência ao namespace do próprio arquivo, ou seja, no exemplo acima
deve haver uma declaração <simpleType name="CEP" />
