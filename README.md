# Návrhové vzory v Javě
Příklady z předmětu KST/KNAV (Pokročilé techniky programování a návrhové vzory). Z každého ze 4 cvičení mám 2 vzory, celkem 8 příkladů.

## Co je v repozitáři?
- Singleton   
Z třídy existuje jen jedna instance (logger a konfigurace).  
- Factory method   
Podtřídy rozhodnou, jaký dopravní prostředek se vytvoří (kamion, loď, letadlo).
- Adapter   
Starý bankovní systém a kryptopeněženka se přes adaptéry používají jako běžná platba.
- Facade   
Jedna metoda zapne celé domácí kino (světla, projektor, zvuk, přehrávač).
- Proxy   
Obrázek se načte z disku až při prvním zobrazení, a jen pro oprávněného uživatele.
- Iterator   
Procházení knihovny knih dopředu i pozpátku.
- Strategy   
Cena dopravy se počítá různými algoritmy a dají se měnit za běhu.
- Template Method   
Generování reportu (TXT, HTML, CSV) podle jedné společné kostry.

**Každá složka je samostatný projekt a má v sobě pom.xml, složku src s kódem a třídu končící na Demo, kterou se příklad spouští.**

## Jak projekt spustit?
**IntelliJ IDEA**
File → Open a vyber složku jednoho příkladu (např. cviceni1/singleton).
Otevři třídu končící na "Demo" pro spuštění.

<img width="1920" height="1038" alt="image" src="https://github.com/user-attachments/assets/5919c495-22f2-4587-bd96-b13695fd91d3" />

## Stručný popis k jednotlivým vzorům
### Cvičení 1
- Singleton: privátní konstruktor a statická metoda getInstance(), která vždy vrací tu samou instanci.
- Factory Method: abstraktní třída Logistics má metodu createTransport(). Podtřídy RoadLogistics, SeaLogistics a AirLogistics ji přepíšou a vrátí Truck, Ship nebo Plane.
### Cvičení 2
- Adapter: třídy BankAdapter a CryptoAdapter převádí volání pay() na rozhraní starých tříd LegacyBank a CryptoWallet.
- Facade: třída HomeTheaterFacade skrývá pět zařízení za metody watchMovie(), listenToMusic() a shutDown().
### Cvičení 3
- Proxy: LazyImageProxy načte obrázek až při prvním použití, ProtectedImageProxy ho zobrazí jen roli ADMIN. Oba mají stejné rozhraní Image jako RealImage.
- Iterator: Library vrací ForwardIterator nebo ReverseIterator. Klient s nimi pracuje přes rozhraní BookIterator.
### Cvičení 4
- Strategy: Order drží rozhraní ShippingStrategy a dá se přepnout mezi TruckStrategy, ShipStrategy a AirStrategy.
- Template Method: ReportGenerator.generate() je kostra algoritmu. TextReport, HtmlReport a CsvReport doplňují jen jednotlivé kroky.

# Přehled návrhových vzorů
- **Factory Method:** Nadtřída říká „vytvoř objekt“, ale nevybírá, jaký. To udělají podtřídy. Je to jako objednávka v restauraci: řekneš „jídlo“ a kuchař (podtřída) rozhodne, jestli udělá pizzu, nebo těstoviny.
- **Abstract Factory:** Továrna nevyrábí jednu věc, ale celou sadu věcí, které k sobě pasují. Je to jako zařizování bytu ve stylu „moderní“ nebo „klasický“: dostaneš židli, stůl i skříň ve stejném stylu a nic se nemíchá.
- **Prototype:** Nový objekt nevytváříš od nuly, ale zkopíruješ hotový a případně upravíš. Je to jako ctrl+C a ctrl+V u souboru: místo psaní dokumentu znovu si zkopíruješ ten starý a změníš v něm jen pár řádků.
- **Builder:** Složitý objekt se postaví po jednotlivých krocích a můžeš si vybrat, které použiješ. Je to jako skládání sendviče v bufetu: nejdřív pečivo, pak sýr, pak zelenina, pak omáčka. Stejným postupem uděláš různé sendviče.
- **Singleton:** Z třídy smí existovat jen jedna instance a všichni používají tu samou. Je to jako ředitel školy: je jeden, a kdo ho potřebuje, vždycky se obrátí na toho samého člověka.
- **Adapter:** Překládá mezi dvěma věcmi, které se jinak nedomluví, aniž bys musel měnit jednu z nich. Je to jako redukce do zásuvky na cestách: tvoje vidlice se do cizí zásuvky nevejde, ale s redukcí ano.
- **Bridge:** Rozdělíš dvě věci, které se mění nezávisle, a spojíš je „mostem“, aby nemusel vznikat zvláštní objekt pro každou kombinaci. Je to jako ovladač a televize: nemusíš vyrábět zvláštní ovladač pro každou televizi, protože oboje se dá libovolně kombinovat.
- **Composite:** Jednotlivý prvek i skupina prvků se používají úplně stejně, takže vznikne stromová struktura. Je to jako složky a soubory v počítači: „smazat“ funguje na soubor stejně jako na celou složku, která má v sobě další soubory.
- **Decorator:** Objektu za běhu přidáš nové chování tím, že ho obalíš dalším objektem. Je to jako oblékání vrstev: základ je tričko, a když je zima, přidáš mikinu a pak bundu. Tričko se nemění, jen se obaluje.
- **Facade:** Složitý systém schováš za jedno jednoduché rozhraní. Je to jako tlačítko „Film“ na ovladači: stiskneš jedno a samo se zhasnou světla, zapne projektor i zvuk, aniž bys musel vědět, jak to funguje uvnitř.
- **Flyweight:** Šetří paměť tím, že mnoho objektů sdílí stejná data místo toho, aby je každý měl vlastní. Je to jako les stejných stromů: nemusíš pro každý strom znovu popisovat, jak vypadá borovice. Stačí jeden popis a každý strom si pamatuje jen své místo.
- **Chain of Responsibility:** Požadavek putuje řetězem objektů, dokud se ho někdo neujme. Je to jako stížnost na zákaznické lince: nejdřív ji řeší operátor, když neumí, předá ji specialistovi, a pak případně vedoucímu.
- **Command:** Z akce se stane objekt, který lze uložit, předat, zopakovat nebo vrátit zpět. Je to jako lístek s objednávkou v restauraci: číšník ho předá kuchyni, ty ho můžeš zrušit a nikdo nemusí vědět, co přesně se děje v kuchyni.
- **Interpreter:** Jednoduchý jazyk se zapíše pomocí tříd, každé pravidlo je jedna třída, a umí se vyhodnotit. Je to jako kalkulačka: rozumí zápisu `5 + 3 - 2` a pozná, co je číslo a co operace.
- **Iterator:** Umožňuje procházet prvky po jednom, aniž bys věděl, jak je kolekce uvnitř uložená. Je to jako listování knihou: otáčíš stránky jednu po druhé a nezajímá tě, jak je kniha svázaná.
- **Mediator:** Objekty spolu nemluví napřímo, ale vždy přes prostředníka. Je to jako řídící letového provozu: letadla se navzájem nedomlouvají, každé mluví jen s věží a ta všechno koordinuje.
- **Proxy:** Před skutečný objekt se postaví zástupce, který rozhoduje, jestli a kdy ho pustí ke slovu. Je to jako recepční: než se dostaneš k řediteli, zeptá se, kdo jsi, a třeba tě vůbec nepustí dál.
- **Memento:** Uloží stav objektu, aby se k němu šlo později vrátit. Je to jako uložená pozice ve hře: když něco pokazíš, nahraješ ji a pokračuješ odtud, kde jsi předtím byl.
- **Observer:** Když se něco změní, automaticky se upozorní všichni, kdo se přihlásili k odběru. Je to jako odběr newsletteru: vydavatel nemusí nikoho obvolávat, jen rozešle novinku všem přihlášeným.
- **State:** Objekt se chová jinak podle toho, v jakém je právě stavu, a každý stav je samostatná třída. Je to jako semafor: tatáž situace „přijíždí auto“ znamená něco jiného na červenou než na zelenou.
- **Strategy:** Máš několik zaměnitelných způsobů, jak něco udělat, a můžeš je za běhu vyměňovat. Je to jako cesta na letiště: cíl je stejný, ale vybereš si podle situace, jestli pojedeš autem, taxíkem nebo autobusem.
- **Template Method:** Nadtřída určí pevný postup, podtřídy doplní jen jednotlivé kroky. Je to jako recept na vaření: postup „nakrájej, osmaž, dochuť“ je daný, ale co se krájí a jak se dochutí, záleží na konkrétním jídle.
- **Visitor:** Novou operaci přidáš nad různými druhy objektů bez toho, abys je musel měnit. Je to jako revizor, který chodí po různých budovách: budovy zůstávají stejné a revizor v každé provede kontrolu podle toho, o jaký typ budovy jde.
