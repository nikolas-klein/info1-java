module BaumOperation where

import DC

isSimple :: Baum -> Bool
isSimple (Zweig _ _) = False
isSimple (Blatt _) = True

partition :: Baum -> [Baum]
partition (Zweig x y) = [x,y]


-- Tests Aufgabe a
a_solve :: Baum -> Int
a_solve (Blatt x) = x

a_combine :: [Int] -> Int
a_combine [] = 0
a_combine (x:xs) = max x (a_combine xs)

-- Aufgabe b
b_solve :: Baum -> Int
b_solve (Blatt x) = 0

b_combine :: [Int] -> Int
b_combine [] = 0
b_combine (x:xs) = (max (x+1) (b_combine xs))

-- CALL Aufgabe a
a_calldc :: Baum -> Int
a_calldc problem = dc isSimple a_solve partition a_combine problem

-- CALL Aufgabe b
b_calldc :: Baum -> Int
b_calldc problem = dc isSimple b_solve partition b_combine problem

main :: IO ()
main =  do 
    -- Tests Aufgabe a
    print (a_calldc (Blatt 3))  -- 3
    print (a_calldc (Zweig (Blatt 3) (Blatt 4))) -- 4
    print (a_calldc (Zweig (Zweig (Zweig (Blatt 4) (Blatt 3) ) (Zweig (Blatt 5) (Blatt 3) ) ) (Zweig (Zweig (Blatt 1) (Blatt 3) ) (Blatt 5) ) )) -- 5

    -- Tests Aufgabe b
    print (b_calldc (Blatt 3)) -- 0
    print (b_calldc (Zweig (Blatt 3) (Blatt 4))) -- 1
    print (b_calldc (Zweig (Zweig (Zweig (Blatt 4) (Blatt 3) ) (Zweig (Blatt 2) (Blatt 3) ) ) (Zweig (Zweig (Blatt 1) (Blatt 3) ) (Blatt 5) ) )) -- 3
    print (b_calldc (Zweig (Zweig (Zweig (Zweig (Blatt 1) (Blatt 1)) (Blatt 1)) (Blatt 1)) (Blatt 1))) -- 4
    print (b_calldc (Zweig (Blatt 1) (Zweig (Blatt 1) (Zweig (Blatt 1) (Zweig (Blatt 1) (Blatt 1)))))) -- 4