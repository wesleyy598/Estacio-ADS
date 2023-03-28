import  React, { useState } from 'react';
import { StyleSheet, Text, TextInput, View, Button, ScrollView, TouchableOpacity, Alert} from 'react-native';

export default function Forms({navigation}) {

  const [nome, setNome] = useState('');
  const [cpf, setCpf] = useState('');
  const [endereco, setEndereco] = useState('');
  const [idade, setIdade] = useState('');
  const [moradia, setMoradia] = useState('');

  const enviar = (nome, cpf, endereco, idade, moradia) =>{
    Alert.alert('Mora sozinho?', ''+moradia);
    Alert.alert('Idade', ''+idade);
    Alert.alert('Endereco', ''+endereco);
    Alert.alert('CPF', ''+cpf);
    Alert.alert('Nome', ''+nome);

  }

  return (
    <View style={styles.container}>
      <TextInput style={styles.textInput}
        placeholder="Digite seu nome" 
        keyboardType="default"
        onChangeText={setNome}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite seu CPF" 
        keyboardType="decimal-pad"
        onChangeText={setCpf}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite seu endereço" 
        keyboardType="default"
        onChangeText={setEndereco}
      />
      <TextInput style={styles.textInput}
        placeholder="Digite sua idade" 
        keyboardType="numeric"
        onChangeText={setIdade}
      />
      <TextInput style={styles.textInput}
        placeholder="Mora sozinho: Sim ou Nao?" 
        keyboardType="default"
        onChangeText={setMoradia}
      />

      <TouchableOpacity  style={styles.button}
      onPress={()=> enviar(nome, cpf, endereco, idade, moradia)}
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
