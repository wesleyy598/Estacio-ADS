import * as React from 'react';
import { StyleSheet, Text, View, Button, ScrollView, TouchableOpacity} from 'react-native';

export default function Home({navigation}) {
  return (
    <ScrollView style={styles.container}>

      <Text style={styles.paragraph}>CADASTRO</Text>
      <Button
        title="Cadastrar Universidade"
        onPress={() => navigation.navigate('CadastrarUniversidade')}
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
