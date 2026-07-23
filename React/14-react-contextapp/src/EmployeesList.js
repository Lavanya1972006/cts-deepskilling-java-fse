import EmployeeCard from "./EmployeeCard";

function EmployeesList(props) {
    return (
        <div>
            <h2>Employees List</h2>

            {props.employees.map(employee => (
                <EmployeeCard
                    key={employee.id}
                    employee={employee}
                />
            ))}
        </div>
    );
}

export default EmployeesList;