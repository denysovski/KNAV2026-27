# KNAV2026-27 – KNAV: Pokročilé techniky programování a návrhové vzory

Tento repozitář slouží pro ukládání semestrální práce k udělení zápočtu z předmětu **KNAV – Vzory**  
(Univerzita Pardubice, KST, studijní program Webové technologie).

Projekt obsahuje Java ukázky a vlastní vypracované příklady GoF návrhových vzorů, které se probírají na cvičeních.

## Přehled cvičení

| Cvičení | Vzory |
|---|---|
| 1 | Factory Method, Abstract Factory, Prototype, Builder, Singleton |
| 2 | Adapter, Bridge, Composite, Decorator, Facade, Flyweight |
| 3 | Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Proxy |
| 4 | Memento, Observer, State, Strategy, Template Method, Visitor |

Celkem **23 vzorů**.

## Podmínky předmětu

- Docházka na cvičení není povinná, ale vyučující ji zapisuje.
- Z každého cvičení se odevzdávají 2 vlastní příklady návrhových vzorů v Javě.
- Každý příklad má být spustitelný projekt, který lze otevřít v IDE (např. IntelliJ IDEA).
- Odevzdání probíhá e-mailem na: **jakub.obornik+knav@gmail.com**  
  nejpozději do příštího cvičení.
- Předmět e-mailu: **„KNAV – cvičení X – Jméno Příjmení“**.
- Za semestr se odevzdává celkem **8 příkladů** (2 × 4 cvičení).

## Zkouška

Zkouška je písemný test v papírové podobě (cca 12 otázek, 60 minut, úspěšnost od 50 %).  
Podrobnosti jsou v úvodní prezentaci: `slides/00-uvod.pdf`.

## Struktura projektu

```text
src/exercises/
├─ exercise1/
│  ├─ Exercise1PoC.java
│  └─ patterns/<vzor>/
├─ exercise2/
├─ exercise3/
└─ exercise4/
slides/
docs/
```

## Jak spustit

Požadavky:
- JDK 21
- libovolné IDE (doporučeno IntelliJ IDEA)

Projekt nepoužívá Maven ani Gradle.

1. Otevřete složku projektu v IntelliJ IDEA.
2. Nastavte `src` jako Sources Root (pokud to IDE neudělá samo).
3. Spusťte `Exercise1PoC` (případně `Exercise2PoC`, `Exercise3PoC`, `Exercise4PoC`) přes Run.

## Prezentace

Prezentace ke cvičením jsou ve složce `slides/`.

## Kontakt

**jakub.obornik+knav@gmail.com**
