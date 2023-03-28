import * as React from 'react';
import { StyleSheet, Text, View, Button, ScrollView, TouchableOpacity} from 'react-native';

export default function HomeScreen({navigation}) {
  return (
    <ScrollView style={styles.container}>

      <Text style={styles.paragraph}>IBGE</Text>
      <Button
        title="Cadastrar Pessoa"
        onPress={() => navigation.navigate('CadastrarPessoa')}
      />
       <Button
        title="Cadastrar Imovel"
        onPress={() => navigation.navigate('CadastrarImovel')}
      />

    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container:{
      flex:1,
      
  },
  paragraph: {
      margin: 24,
      fontSize: 18,
      fontWeight: 'bold',
      textAlign: 'center',
  },
});
