

module Tweets where

import Prelude hiding (print)

-- signature of tweet algebras
class TweetAlg x where
  post  :: String -> String -> x
  reply :: String -> x -> x

-- print algebra
newtype Print = Print {print :: String}

instance TweetAlg Print where
  post  u s    = Print (s ++ " (" ++ u ++ ")")
  reply t x = Print ("@" ++ t ++ " " ++ print x)

-- extend signature with retweets
class TweetAlg x => RetweetAlg x where
  retweet :: x -> x

-- extend printer
instance RetweetAlg Print where
  retweet x = Print ("RT " ++ print x)

t1 = post "tvdstorm" "Hello @JoyOfCoding!"
t2 = retweet t1

main = do putStrLn (print t1)
          putStrLn (print t2)


