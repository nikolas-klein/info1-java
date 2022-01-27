module Telefonbuch where

import Data

leeresTelefonbuch :: Telefonbuch
leeresTelefonbuch = []

eintragen :: String -> String -> Telefonbuch -> Telefonbuch
eintragen name nummer buch = (name, nummer) : buch

suche :: String -> Telefonbuch -> String
suche suchString [] = "nicht gefunden"
suche suchString ((name,nummer):rest) = if name == suchString then nummer else suche suchString rest

sucheMuster :: String -> Telefonbuch -> Telefonbuch
sucheMuster suchString [] = []
sucheMuster suchString buch = filter (finde suchString) buch

finde :: String -> (String, String) -> Bool
finde [] _ = True
finde (s:ss) (_,[]) = False
finde (s:ss) (x,(n:ns)) = s == n && finde ss (x,ns)

main :: IO ()
main =  do 
    print (suche "Person2" (eintragen "Person2" "Zweite Nummer" (eintragen "Person" "Erste Nummer" leeresTelefonbuch)))
    print (suche "Person" (eintragen "Person2" "Zweite Nummer" (eintragen "Person" "Erste Nummer" leeresTelefonbuch)))
    print (sucheMuster "+49 251" (eintragen "Person 3" "+43 251 12354" (eintragen "Person 2" "+49 251 83" (eintragen "Person 1" "+49 751 83" leeresTelefonbuch))))