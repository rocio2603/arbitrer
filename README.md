## arbitrer

request:
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
request:   
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


