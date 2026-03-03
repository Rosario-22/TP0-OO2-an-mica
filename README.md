Concepto del artículo de *Martin Fowler*
Un objeto anémico es una clase que solo contiene atributos, getters y setters.
No contiene lógica de negocio, ésta se encuentra en otra parte, en este caso, se encuentra en la clase Main.
Que la lógica del negocio se encuentre en clases externas, rompe el principio del encapsulamiento. 
Aunque estructuralmente parece orientación a objetos, en realidad se trata de programación proocedural disfrazada,  ya que los datos y la lógica están separados. 
