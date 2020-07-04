export interface UserStatus {
    userId: string;
    monthly: MonthlyData[];
}

export interface MonthlyData {
    monthAndYear: string;
    userStatusData: UserStatusDataModel[];
}

export interface UserStatusDataModel {
    date: Date;
    status: string;
}