/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ApiBrasil;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author pedro
 */
public record Endereco(String cep,
        
    @SerializedName("state") // estado
    String estado,
    
    @SerializedName("city") //cidade
    String cidade,
    
    @SerializedName("neiborhood") //bairro
    String bairro,
    
    @SerializedName("street") //rua
    String rua,
    
    String Servico
) {

}
