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
