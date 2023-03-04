# clock-custom-view

Custom View в виде стрелочных часов с часовой, минутной и секундной стрелками.
Реализованное Custom View имеет кастомные атрибуты, которые позволяют изменить цвет его частей.
Custom View корректно работает при любых установливаемых размерах.
View сохраняет состояние (цвета частей) при смене конфигурации благодаря переопределению методов onSaveInstanceState() и onRestoreInstanceState().

Для демонстрации работы реализованного Custom View разработано приложение, которое состоит из трех экранов, на которых используется Clock Custom View:
1. Часы на полный экран.
2. Часы помещены в пример пользовательского интерфейса в релевантном месте, в котором пользователю было бы нужно посмотреть на текущее время.
3. 6 часов в разных расцветках.

Навигация между экранами производится при помощи Bottom Navigation View.

Проверить сохранение состояния можно на втором экране, изменив цвет секундной стрелки часов нажатием на кнопку, повернув экран и увидев, что измененный цвет сохранился.

Стандартный вид часов:

![image](https://user-images.githubusercontent.com/73700612/222894775-27651b25-1970-4a44-a8e8-17e1ac1ab812.png)
