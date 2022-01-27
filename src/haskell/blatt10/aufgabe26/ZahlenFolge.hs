module ZahlenFolge where

zahlenFolge :: [Int] 
zahlenFolge = liste (naechsteZahl 1)

liste :: Int -> [Int]
liste x = x : liste(naechsteZahl (x+1))

naechsteZahl :: Int -> Int
naechsteZahl x = if (mod x 5 == 0 || mod x 7 == 0 || mod x 9 == 0) then x else naechsteZahl (x+1)



zahlenFolgeExtended :: [Int] -> [Int]
zahlenFolgeExtended  a = listeExtended (naechsteZahlExtended 1 a) a

listeExtended :: Int -> [Int] -> [Int]
listeExtended x a = x : listeExtended (naechsteZahlExtended (x+1) a) a

naechsteZahlExtended :: Int -> [Int] -> Int
naechsteZahlExtended x l = if (pruefeTeiler x l) then x else naechsteZahlExtended (x+1) l  

pruefeTeiler :: Int -> [Int] -> Bool
pruefeTeiler x [] = False
pruefeTeiler x (a:r) = if (mod x a == 0) then True else pruefeTeiler x r

