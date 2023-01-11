package edu.tarik.primeirasemana;

public class SmartTV {
  boolean ligada = false;
  int canal = 1, volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    if (volume < 100)
      volume++;
  }

  public void diminuirVolume() {
    if (volume > 0)
      volume--;
  }

  public void mudarCanal(int canalSelecionado) {
    canal = canalSelecionado;
  }

  public void aumentarCanal() {
    canal = canal >= 100 ? canal = 0 : canal + 1;
  }

  public void diminuirCanal() {
    canal = canal <= 0 ? canal = 100 : canal - 1;
  }
}
