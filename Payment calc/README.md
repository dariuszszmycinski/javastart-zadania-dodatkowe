Napisz program, który będzie się składał z kilku klas.

Employee - reprezentuje pracownika, powinna posiadać co najmniej pola do przechowywania imienia, nazwiska i miesięcznej pensji
PaymentCalculator - kalkulator płac, który posiada metodę nettoYearPayment i bruttoYearPayment. Obie metody powinny przyjmować jako argument obiekt typu Employee. Pierwsza zwraca roczną sumę wypłat danego pracownika, natomiast druga zwraca roczną sumę wypłat wraz z dodatkowymi podatkami (ZUS, podatki do urzędu skarbowego). Dla uproszczenia przyjmujemy, że miesięczny koszt ZUS to 1000zł a podatek dochodowy wynosi 20%.
W klasie testowej utwórz przynajmniej jednego pracownika i oblicz jego roczną wypłatę oraz roczny całkowity koszt pracodawcy.

Przykładowo dla pracownika zarabiającego miesięcznie 3000zł powinniśmy otrzymać:

36000zł - bo 3000 * 12 = 36000

55200zł - bo 12*1000 + 12*(3000 + 0,2*3000) = 55200, gdzie 3000 to wypłata netto, a 1000 to koszt zus.
