import SwiftUI
import shared

struct ContentView: View {
    @State private var inputText = ""
    @State private var morseText = ""
    @State private var semaforicoText = ""

    let traduttore = TraduttoreMorseSemaforico()

    var body: some View {
        VStack(alignment: .center) {
            // Titolo centrato
            Text("Traduttore Morse e Semaforico")
                .font(.title)
                .multilineTextAlignment(.center)
                .padding(.bottom, 20)

            // Campo di testo per l'input
            TextField("Inserisci il messaggio da tradurre", text: $inputText)
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()

            // Bottone per la traduzione
            Button("Traduci") {
                morseText = traduttore.traduciMorse(messaggio: inputText)
                semaforicoText = traduttore.traduciSemaforico(messaggio: inputText)
            }
            .padding()

            // Output: Morse e Semaforico, allineato a sinistra
            VStack(alignment: .leading) {
                Text("Morse: \(morseText)")
                    .font(.body)
                    .padding(.bottom, 8)

                Text("Semaforico: \(semaforicoText)")
                    .font(.body)
                    .padding(.bottom, 8)
            }
            .frame(maxWidth: .infinity, alignment: .leading) // Allineamento a sinistra
        }
        .padding()
        .background(Color.white) // Sfondo bianco
        .edgesIgnoringSafeArea(.all) // Ignora le aree sicure per utilizzare tutto lo schermo
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

