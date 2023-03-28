import  React, { useState } from 'react';
import { StyleSheet, Text, TextInput, View, Button, ScrollView, TouchableOpacity, Alert} from 'react-native';

export default function FormsCadastrarUniversidade({navigation}) {
  
  const [nome, setNome] = useState('');
  const [endereco, setEndereco] = useState('');
  const [campus, setCampus] = useState('');

  const enviar = (nome, endereco, campus) =>{

    Alert.alert('Nome', ''+nome);
    Alert.alert('Endereco', ''+endereco);
    Alert.alert('Campus', ''+campus);
  }

  return (
    <View style={styles.container}>
    <TextInput style={styles.textInput}
        placeholder="Digite o nome da instituição" 
        keyboardType="default"
        onChangeText={setNome}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite o endereço" 
        keyboardType="default"
        onChangeText={setEndereco}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite o nome do Campus" 
        keyboardType="default"
        onChangeText={setCampus}
      />

      <TouchableOpacity  style={styles.button}
      onPress={()=> enviar(nome, endereco, campus)}
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
