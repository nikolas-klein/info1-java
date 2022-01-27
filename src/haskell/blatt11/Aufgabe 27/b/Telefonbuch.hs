module Telefonbuch where

import Data

eintragen :: String -> String -> Telefonbuch -> Telefonbuch
eintragen name nummer buch name2 = if name == name2 then nummer else buch name2

leeresTelefonbuch :: Telefonbuch
leeresTelefonbuch name = "nicht gefunden"

suche :: String -> Telefonbuch -> String
suche name buch = buch name

sucheMuster :: String -> Telefonbuch -> Telefonbuch
sucheMuster nummer buch name = if subStr nummer (buch name) then buch name else "nicht gefunden"

subStr :: String -> String -> Bool
subStr [] _ = True
subStr (s:ss) [] = False
subStr (s:ss) (n:ns) = s == n && subStr ss ns

main :: IO ()
main =  do 
    print (suche "Person2" (eintragen "Person2" "Zweite Nummer" (eintragen "Person" "Erste Nummer" leeresTelefonbuch)))
    print (suche "Person" (eintragen "Person2" "Zweite Nummer" (eintragen "Person" "Erste Nummer" leeresTelefonbuch)))
    print (sucheMuster "+49 251" (eintragen "Person 3" "+43 251 12354" (eintragen "Person 2" "+49 251 83" (eintragen "Person 1" "+49 751 83" leeresTelefonbuch))) "Person 2")
    print (sucheMuster "+49 251" (eintragen "Person 3" "+43 251 12354" (eintragen "Person 2" "+49 251 83" (eintragen "Person 1" "+49 751 83" leeresTelefonbuch))) "Person 1" )