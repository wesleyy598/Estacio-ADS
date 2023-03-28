import * as React from 'react';
import { StyleSheet, Text, View, Button, ScrollView} from 'react-native';

import FormsCadastrarUniversidade from './FormsCadastroUniversidade';

export default function HomeScreen({navigation}) {
  return (
    <View style={styles.container}>
      <FormsCadastrarUniversidade/>
    </View>
  );
}
const styles = StyleSheet.create({
  container:{
      flex:1,
  },
});
