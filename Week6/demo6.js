const employee = {
    firstName : 'Mark',
    lastnName : 'Smith',
    getFullName : function(){
        console.log(this)
        return this.firstName + '' + this.lastnName;
    }
}

employee.getFullName(employee);