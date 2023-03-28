import  React, { useState } from 'react';
import { StyleSheet, Text, TextInput, View, Button, ScrollView, TouchableOpacity, Alert} from 'react-native';

export default function Forms({navigation}) {

  const [moradia, setMoradia] = useState('');
  const [numero, setNumero] = useState('');
  const [endereco, setEndereco] = useState('');
  const [bairro, setBairro] = useState('');

  const enviar = (moradia, numero, endereco, bairro) =>{

    Alert.alert('Bairro', ''+bairro);
    Alert.alert('Endereco', ''+endereco);
    Alert.alert('Numero da casa', ''+numero);
    Alert.alert('Moradia', ''+moradia);
    
  }

  return (
    <View style={styles.container}>
      <TextInput style={styles.textInput}
        placeholder="Predio ou casa?" 
        keyboardType="default"
        onChangeText={setMoradia}
      />
      <TextInput style={styles.textInput}
        placeholder="Numero da casa?" 
        keyboardType="decimal-pad"
        onChangeText={setNumero}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite seu endereço?" 
        keyboardType="default"
        onChangeText={setEndereco}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite seu bairro?" 
        keyboardType="default"
        onChangeText={setBairro}
      />

      <TouchableOpacity  style={styles.button}
      onPress={()=> enviar(moradia, numero, endereco, bairro)}
        >
        <Text style={styles.textButton}>Enviar</Text>
      </TouchableOpacity>
    </View>
  );

}
const styles = StyleSheet.create({
  container:{
    flex:1,
    alignItems: "center",
    marginTop: 25,
  },
  textInput:{
    width: 200, 
    height: 35,
    backgroundColor: 'white',
 },
 button:{
    backgroundColor: '#A2C5F2',
    width: 200,
    height: 45,
    marginTop:50,
    borderRadius: 20,
    justifyContent: 'center',
    alignItems: 'center',
     },
 textButton:{
        color: 'white',
        fontWeight: '700'
      },
});
