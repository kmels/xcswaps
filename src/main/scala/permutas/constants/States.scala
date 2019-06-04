package permutas.constants

object States extends Enumeration {
  val ADD_NEW_PAYEE,
  ADD_NEW_PAYEE_ADDRESS,
  ADDRESS_LIST,
  BROADCAST_PAYEE_NTX,
  FAUCETMENU,
  LANGUAGE,
  LANGUAGEMENU,
  LOCK,
  LOCK_COIN,
  LOCK_COIN_SCRIPT,
  LOCK_COIN_SCRIPT_TO,
  LOCK_COIN_SCRIPT_TO_AMOUNT,
  LOCK_CONFRMATION,
  MAINMENU,
  SETTINGSMENU,
  SPEND,
  SPEND_COIN,
  SPEND_COIN_TO,
  SPEND_COIN_TO_AMOUNT,
  SPEND_COIN_TO_NTX,
  SWAPSMENU,
  STARTSTATE,
  TX_MEMO,    
  UNITS,
  WALLET_PEERS,
  WALLETMENU,
  WHOAMIMENU = Value
}
