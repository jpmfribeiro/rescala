package com.rescala

/**
  * Created by jpedro on 21.05.16.
  */
class Rescal {

  // FIELDS


  // PUBLIC INTERFACE

  def fit(triples: Array[(String, String, String)], params: RescalParameters): Unit = {

  }

  def predict(t: (String, String, String)): Double = {
    0.0
  }

}

case class RescalParameters()
