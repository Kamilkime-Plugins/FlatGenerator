# FlatGenerator
Bardzo prosty generator płaskich, warstwowych map

----------------------------------------------------
### :clipboard: Wymagania
- Silnik Spigot, Paper lub jakiś inny ich fork
- Wersja MC minimum 1.17

----------------------------------------------------
### :gear: Konfiguracja
Główna konfiguracja pluginu dostępna jest w pliku `config.yml`. Poza tym należy dodać ustawienia generatora do pliku `bukkit.yml`, dla
każdego świata, który ma być generowany przez plugin. Przykładowo dla dwóch map:
```yaml
worlds:
  world:
    generator: FlatGenerator
  world_nether:
    generator: FlatGenerator
```

----------------------------------------------------
### :memo: Błędy i propozycje
Wszelkie błędy, propozycje dodania czegoś nowego czy jakiekolwiek pytania — powinny być zadawane
[tu](https://github.com/Kamilkime-Plugins/FlatGenerator/issues). Jeśli nie posiadasz konta na GitHubie, możesz także napisać do mnie na
Discordzie — **Kamilkime#9792**.

----------------------------------------------------
### :unlock: Licencja
Plugin rozpowszechniany jest na licencji [Apache License 2.0](https://choosealicense.com/licenses/apache-2.0/), która pozwala na dalszą
modyfikację kodu (również w celach komercyjnych), pod warunkiem zachowania oryginalnych informacji o licencji i wskazaniu zmian w
oryginalnym kodzie.
