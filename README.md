# Stacks
Third assignment for algorithms and data structures exercises.

1. Przechodny stos Veloso (ang. Veloso's Traversable Stack, VTS) to stos, który poza
normalnymi operacjami ma możliwość nieniszczącego odczytu z pozycji wskazywanej przez
kursor (operacja peek). Kursor można ustawić na szczycie stosu (operacja top) i przesunąć
o jedną pozycję w dół stosu (operacja down - należy zwrócić informację, że osiągnięto dół
stosu). Normalne operacje (push i pop) automatycznie umieszczają kursor na górze.
Zaimplementuj VTS jako rozszerzenie zwykłego stosu.

2. Dodaj do stosu operację reverse(), która odwraca kolejność stosu. Użyj w jej
implementacji dodatkowego stosu bez odwoływania się do wewnętrznej reprezentacji tych
stosów.

3. Zaimplementuj wydajną kolejkę przy użyciu dwóch stosów (wewnętrzna reprezentacja
kolejki używa dwóch stosów).

4. Zaimplementuj stos tonący: Stos o ograniczonej pojemności, w momencie wkładania
elementu do pełnego stosu, usuwa element na dole stosu („sink”), aby zrobić miejsce na
górze dla nowego elementu. Zaimplementuj taki stos na tablicy:  
a. Nieefektywne – dodawanie może w przypadku usuwania elementu potrzebować
czasu O(n).  
b. Efektywnie – idea analogiczna do efektywnej realizacji kolejki na wykładzie w czasie
O(1).  

5. Rozwiązać problem Józefa Flawiusza jako kolejki liczb (stanowiska ludzi). Problem: n osób
jest ustawionych w kole. Zaczynamy odliczać od pierwszej osoby (licząc tylko osoby
pozostające przy życiu) i każda k-ta osoba musi popełnić samobójstwo. Pytanie brzmi, dla
danych n i k, na której pozycji należy się ustawić, aby być ostatnim wybranym (czyli
przetrwać). Na przykład mamy n = 6 osób i co usuwamy co drugą osobę (k = 2). Jeśli
ponumerujemy osoby od 1 do 6, osoby z numerami 2, 4, 6 będą eliminowane jedna po
drugiej (więc w kole zostaną 1, 3, 5), potem popełnią samobójstwo 3, 1 i zostanie przy życiu
osoba numer 5.
