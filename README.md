It's a simple BlockChain Demo. 
It contains mine and transefer function.
This is test result:


/**
Trying to Mine block 1... 
target:00000
Block Mined!!! : 0000080f570ee67ecb319aad3be21b1b49f29c020afc30e75e24ef58c00b8be9
Trying to Mine block 2... 
target:00000
Block Mined!!! : 0000006715e88491a3cb1ae90147ac51889131e759b498bc3c9ea1ce6fba586c
Trying to Mine block 3... 
target:00000
Block Mined!!! : 0000058ccb599cdd4fa22eae9106533009ad17282ab8cd2ecd941cf116d6bd9d
Successful transaction,hash:00000d12f940cb238df8fbd7ba9d458312da6bbfdea9e69865b0c1822743ab67
Blockchain is Valid: true
The block chain: 
[
  {
    "hash": "0000080f570ee67ecb319aad3be21b1b49f29c020afc30e75e24ef58c00b8be9",
    "previousHash": "0",
    "data": "Hi im the first block",
    "timeStamp": 1704769902419,
    "nonce": 1367155
  },
  {
    "hash": "0000006715e88491a3cb1ae90147ac51889131e759b498bc3c9ea1ce6fba586c",
    "previousHash": "0000080f570ee67ecb319aad3be21b1b49f29c020afc30e75e24ef58c00b8be9",
    "data": "Yo im the second block",
    "timeStamp": 1704769908331,
    "nonce": 389801
  },
  {
    "hash": "0000058ccb599cdd4fa22eae9106533009ad17282ab8cd2ecd941cf116d6bd9d",
    "previousHash": "0000006715e88491a3cb1ae90147ac51889131e759b498bc3c9ea1ce6fba586c",
    "data": "Hey im the third block",
    "timeStamp": 1704769909823,
    "nonce": 10141
  },
  {
    "hash": "00000d12f940cb238df8fbd7ba9d458312da6bbfdea9e69865b0c1822743ab67",
    "previousHash": "0000058ccb599cdd4fa22eae9106533009ad17282ab8cd2ecd941cf116d6bd9d",
    "data": "Try to transaction",
    "timeStamp": 1704769909858,
    "transaction": {
      "sender": "dsfalkjfdsa",
      "recipient": "daslfjklsdjaf",
      "amount": "100BTC"
    },
    "nonce": 2533837
  }
]
***/
