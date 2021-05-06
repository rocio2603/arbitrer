# arbitrer

request:
GET arbitrer/arbitrages

response:
{
"ticker": "BTC/USD",
"buyMarket": "BINANCE",
"buyPrice": 56292.41,
"sellMarket": "COINBASE",
"sellPrice": 56647.53,
"percentageSpread": 0.6308488124775531
},

{
"ticker": "BTC/USD",
"buyMarket": "BITTREX",
"buyPrice": 56324.50069872,
"sellMarket": "COINBASE",
"sellPrice": 56647.53,
"percentageSpread": 0.5735147178807334
},

  {
"ticker": "BTC/USD",
"buyMarket": "BINANCE",
"buyPrice": 56292.41,
"sellMarket": "BITTREX",
"sellPrice": 56324.50069872,
"percentageSpread": 0.05700715020017731
}

request:
GET arbitrer/marketpricesBTC

response:
  {
"price": 56417.63,
"market": "BINANCE"
},
  {
"price": 56427.77571345,
"market": "BITTREX"
},
  {
"price": 56767.75,
"market": "COINBASE"
}

[
   {"ticker":"BTC/USD", "buyMarket":"BINANCE", "buyPrice":56292.41, "sellMarket":"COINBASE", "sellPrice":56647.53, "percentageSpread":0.6308488124775531},
   
   {"ticker":"BTC/USD", "buyMarket":"BITTREX", "buyPrice":56324.50069872, "sellMarket":"COINBASE", "sellPrice":56647.53, "percentageSpread":0.5735147178807334 },
   
   {"ticker":"BTC/USD", "buyMarket":"BINANCE", "buyPrice":56292.41, "sellMarket":"BITTREX", "sellPrice":56324.50069872, "percentageSpread":0.05700715020017731}
]

