
# Curso Spring Framework e Spring Boot

Este repositório contém todos os projetos e conceitos adquiridos durante o curso **Spring Framework e Spring Boot** na **Udemy**. Entre eles temos:

- **projeto1**: Projeto inicial, utilizando a linha de comando.
- **projetoWeb**: Aplicação Web, utilizando Padrão MVC e Thymeleaf.
- **projetoRest**: API Rest, utilizando Padrão MVC e metódos HTTP.
## 📋 Conceitos

- **Bean** - Beans são instancias de classes que são gerenciadas por um Spring Ioc container. Na definição oficial: Um bean é um objeto que é instanciado, montado e gerenciado por um Spring IoC container.

- **REST** - REST (Representational State Transfer) refere-se a um grupo de restrições de design dentro da arquitetura de software que geram sistemas distribuídos eficientes, confiáveis e escaláveis. Um sistema é denominado RESTful quando adere a todas essas restrições. A ideia básica do REST é que um recurso, por exemplo um documento, seja transferido com seu estado bem definido, padronização de operações e formatos, ou serviços que se autodenominem RESTful, quando modificam diretamente o tipo de documento, ao invés de desencadear ações em algum lugar.
## 📌 Anotações Spring

- **@Bean** - Esta anotação denota que aquela classe ou interface é um bean.

- **@Component** - Esta anotação faz com que o bean registrado no Spring possa ser utilizado em qualquer bean, seja ele um serviço, um DAO, um controller, etc.

- **@Autowired** - É a anotação mais utilizada com relação a injeção de dependências. Como o próprio nome diz, o Autowired, indica um ponto aonde a injeção automática deve ser aplicada. Esta pode ser usada em métodos, atributos e construtores.

- **@Controller** - Esta anotação indica que aquela classe será um controller - Controller: o controlador existe entre o visual e o modelo. Ele recebe os eventos disparados pela visualização (ou outra fonte externa) e executa a reação apropriada a esses eventos. Na maioria dos casos, a reação é chamar um método no modelo. Como o visual e o modelo são conectados por meio de um mecanismo de notificação, o resultado dessa ação é automaticamente refletido na visualização.

- **@RequestMapping** - A anotação @RequestMapping indica que o controlador receberá as requisições feitas a partir da URL dada.

- **@Service** - Marcamos beans com @Service para indicar que ele está mantendo a lógica de negócios.

- **@Configuration** - Essa é uma anotação a nível de Classe que diz para o Container de Inversão de Controle do Spring que essa classe é a fonte de beans (dependencias requeridas por outras classes no projeto).

- **@Profile** - Esta anotação determina quais serão as configurações definidas para determinado ambiente de desenvolvimento, com ele você pode definir valores para variáveis que serão utilizados pela sua aplicação e que tipo de Configuração será feito em determinado ambiente, tudo isso em tempo de execução.
## ✅ Tech Stack

**Client:** Thymeleaf.

**Server:** Java, Spring Boot, Spring Framework e API REST.

