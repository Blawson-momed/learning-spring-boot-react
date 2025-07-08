import { createContext, useContext, useState } from "react";

//Creates a context
export const AuthContext = createContext()
export const useAuth = () => useContext(AuthContext)

//share the created context with other components
export default function AuthProvider({ children }){
    
    const [isAuthenticated, setAuthenticated] = useState(false)
    //anything thatyou put in here can be shared globally 
    const valueToBeShared = {isAuthenticated, login, logout}

    //handles when the user logs in 
    function login(username, password) {
        if (username==='forces23' && password==='dummy'){
            setAuthenticated(true)
            console.log('success')
            return true
            
        }
        else{
            setAuthenticated(false)
            console.log('failed')
            return false
        }
    }

    //handles when the user logs out
    function logout(){
        setAuthenticated(false)
    }

    return(
        //states that the shared values can be used in all children of the Context... you can see children in TodoApp.jsx
        <AuthContext.Provider value={ valueToBeShared }>
            {children}
        </AuthContext.Provider>
    )
}