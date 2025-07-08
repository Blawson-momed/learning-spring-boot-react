export default function ResetButton({ResetCounterParentFunction}){
        
    function resetFunction(){
            console.log("!!! RESET !!!")
            ResetCounterParentFunction()
    }

    return(
            <div className="reset">
                    <button className="resetButton"
                            onClick={resetFunction}
                    >Reset</button>
            </div>

    )
}