## arbitrer


# GET arbitrer/arbitrages

response:
```
[
      {
         "ticker": "BTC/USD",
         "buyMarket": "BINANCE",
         "buyPrice": 56432.53,
         "sellMarket": "COINBASE",
         "sellPrice": 56785.2,
         "percentageSpread": 0.624941
      },
      {
         "ticker": "BTC/USD",
         "buyMarket": "BITTREX",
         "buyPrice": 56445.195,
         "sellMarket": "COINBASE",
         "sellPrice": 56785.2,
         "percentageSpread": 0.6023654
      },
      {
         "ticker": "BTC/USD",
         "buyMarket": "BINANCE",
         "buyPrice": 56432.53,
         "sellMarket": "BITTREX",
         "sellPrice": 56445.195,
         "percentageSpread": 0.022440434
      }
]
```
   
# GET arbitrer/marketpricesBTC

response:
```
[
      {
         "price": 56417.63,
         "market": "BINANCE"
      },
      {
         "price": 56427.777,
         "market": "BITTREX"
      },
      {
         "price": 56767.75,
         "market": "COINBASE"
      }
]
```
# GET arbitrer/arbitrages?percentageSpread=0.2

response:
```
[
      {
         "ticker": "BTC-USDT",
         "buyMarket": "BITTREX",
         "buyPrice": 44504.07181473,
         "sellMarket": "BITFINEX",
         "sellPrice": 45000,
         "percentageSpread": 1.1143433961156286
   },
      {
         "ticker": "BTC-USDT",
         "buyMarket": "KRAKEN",
         "buyPrice": 44486.3,
         "sellMarket": "COINBASE",
         "sellPrice": 44705.15,
         "percentageSpread": 0.49194920683446036
   },
     {
         "ticker": "BTC-USDT",
         "buyMarket": "BITTREX",
         "buyPrice": 44504.07181473,
         "sellMarket": "COINBASE",
         "sellPrice": 44705.15,
         "percentageSpread": 0.4518197483301942
   },
     {
         "ticker": "BTC-USDT",
         "buyMarket": "POLONIEX",
         "buyPrice": 44514.42892685,
         "sellMarket": "COINBASE",
         "sellPrice": 44705.15,
         "percentageSpread": 0.4284477589579129
   },
     {
         "ticker": "BTC-USDT",
         "buyMarket": "BINANCE",
         "buyPrice": 44522.5,
         "sellMarket": "COINBASE",
         "sellPrice": 44705.15,
         "percentageSpread": 0.41024201246561054
   }     
     
]
```



