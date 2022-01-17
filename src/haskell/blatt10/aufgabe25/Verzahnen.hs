module Verzahnen where

verzahnen :: [a] -> [a] -> [a]
verzahnen (x:xs) (y:ys) = x:y: verzahnen xs ys
verzahnen x [] = x
verzahnen [] y = y
verzahnen [] [] = []
